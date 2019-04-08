package com.mycompany.a2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Vector;

import com.mycompany.a2.FixedObjects.SpaceStation;
import com.mycompany.a2.GameWorldObjects.GameObject;
import com.mycompany.a2.Interfaces.IMovable;
import com.mycompany.a2.MovableObjects.Asteroid;
import com.mycompany.a2.MovableObjects.Missile;
import com.mycompany.a2.MovableObjects.MissileLauncher;
import com.mycompany.a2.MovableObjects.NPShip;
import com.mycompany.a2.MovableObjects.PShip;
import com.mycompany.a2.MovableObjects.SteerableLauncher;
import com.mycompany.a2.Interfaces.IGameWorld;
import com.mycompany.a2.Interfaces.IItterator;

public class GameWorld extends Observable implements IGameWorld {

	// Vector<GameObject> objectCollection = new Vector<GameObject>();
	private Vector objectCollection = new Vector();
	private int ticks;
	private int score;
	private GameObjectCollection GameObjCollection;
	private int lives;
	private int width = 1024;
	private int height = 768;
	private boolean sound;

	public void init(int width, int height) {
		this.score = 0;
		this.ticks = 0;
		this.GameObjCollection = new GameObjectCollection();
		this.height = height;
		this.width = width;
		this.lives = lives;
	}
	public void sound() {
		this.sound = !this.getSound();
	}
	public boolean decrementPSLife() {
		boolean exit = false;
		int life;
		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof PShip) {
				life = ((PShip) obj).getLife();
				if (life > 1) {
					((PShip) obj).setLife(life - 1);
					System.out.println("lives decremented by 1");
					return true;
				} else {
					((PShip) obj).setLife(life - 1);
					exit = true;
				}

			}

		}
		if (exit == true) {
			endGame();
			System.out.println("END GAME. Thanks for playing");
		}
		return false;
		/*
		 * if (PlayerShipExists()) { for (GameObject obj : objectCollection) { if (obj
		 * instanceof PShip) { life = ((PShip) obj).getLife(); if (life > 1) { ((PShip)
		 * obj).setLife(life - 1); return true; } else { ((PShip) obj).setLife(life -
		 * 1); exit = true; }
		 * 
		 * } } } if (exit == true) { endGame();
		 * System.out.println("END GAME. Thanks for playing"); } return false;
		 */
	}

	private void endGame() {
		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			GameObjCollection.delete(obj);
		}
	}

	public boolean PlayerShipExists() {
		IItterator it = GameObjCollection.getIterator();
		boolean Exists = false;
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof PShip) {
				Exists = true;
			}

		}
		if (!Exists) {
			System.out.println("There are no PS: ");
		}
		return Exists;
	}

	public boolean asteroidExists() {
		IItterator it = GameObjCollection.getIterator();
		boolean Exists = false;
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof Asteroid) {
				Exists = true;
			}

		}
		if (!Exists) {
			System.out.println("There are no asteroids.");
		}
		return Exists;
	}

	public boolean missileExists() {
		IItterator it = GameObjCollection.getIterator();
		boolean Exists = false;
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof Missile) {
				Exists = true;
			}

		}
		if (!Exists) {
			System.out.println("There are no missiles.");
		}
		return Exists;
	}

	public boolean spaceStationExists() {
		IItterator it = GameObjCollection.getIterator();
		boolean Exists = false;
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof SpaceStation) {
				Exists = true;
			}

		}
		if (!Exists) {
			System.out.println("There are no missiles.");
		}
		return Exists;
	}

	public boolean deleteMissile() {

		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof Missile) {
				GameObjCollection.delete(obj);
				System.out.println("Removed missile");
				return true;
			}

		}
		System.out.println("No missiles");
		return false;

	}

	public boolean deletePS() {

		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof PShip) {
				GameObjCollection.delete(obj);
				System.out.println("Removed PS");
				return true;
			}

		}
		System.out.println("No PS to remove");
		return false;

	}

	public boolean deleteAsteroid() {

		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof Asteroid) {
				GameObjCollection.delete(obj);
				System.out.println("Removed Asteroid");
				return true;
			}

		}
		System.out.println("No PS to remove");
		return false;

	}

	public boolean deleteNPS() {

		IItterator it = GameObjCollection.getIterator();
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof NPShip) {
				GameObjCollection.delete(obj);
				System.out.println("Removed NPShip");
				return true;
			}

		}
		System.out.println("No NPs to remove");
		return false;

	}
/*
	public int PSLocationInVector() {
		int x = 0;
		for (GameObject obj : objectCollection) {
			if (obj instanceof PShip) {
				x = objectCollection.indexOf(obj);
			}
		}
		return x;
	}

	public int NPSLocationInVector() {
		int x = 0;
		for (GameObject obj : objectCollection) {
			if (obj instanceof NPShip) {
				x = objectCollection.indexOf(obj);
			}
		}
		return x;
	}*/
/*
	public int MissleLocationInVector() {
		int x = 0;
		for (GameObject obj : objectCollection) {
			if (obj instanceof Missile) {
				x = objectCollection.indexOf(obj);
			}
		}
		return x;
	}
*/
	public boolean NonPlayerShipExists() {
		IItterator it = GameObjCollection.getIterator();
		boolean Exists = false;
		while (it.hasNext()) {
			GameObject obj = (GameObject) it.getNext();
			if (obj instanceof NPShip) {
				Exists = true;
			}

		}
		if (!Exists) {
			System.out.println("There are no NPS.");
		}
		return Exists;
	}

	public void addNewAsteroid() {
		Asteroid asteroid = new Asteroid(this.width, this.height);
		GameObjCollection.add(asteroid);
		System.out.println("Asteroid created: ");
		System.out.println(asteroid);
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));

	}

	public void addNewNps() {
		NPShip nps = new NPShip(this.width, this.height);
		GameObjCollection.add(nps);
		System.out.println("NPS created: ");
		System.out.println(nps);
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void addNewBlinkingStation() {

		SpaceStation spaceStation = new SpaceStation(this.width, this.height);
		GameObjCollection.add(spaceStation);
		System.out.println("SpaceStation created: ");
		System.out.println(spaceStation);
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void addPlayerShip() {

		SpaceStation spaceStation = new SpaceStation(this.width, this.height);
		GameObjCollection.add(spaceStation);
		System.out.println("PS created: ");
		System.out.println(spaceStation);
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}
	/*
	 * template for next few funcs. if(PlayerShipExists()== true) {
	 * 
	 * }else { System.out.println(""); }
	 */

	/*
	 * template for next few funcs. for(GameObject obj:objectCollection ){ if (obj
	 * instanceof PShip){
	 * 
	 * 
	 * }else{
	 * 
	 * }
	 * 
	 * }
	 */
	public void increaseSpeedPS() {

		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					int speed = ((PShip) obj).getspeed();
					if (speed > 15) {
						System.out.println("Can't go any faster.");
					} else if (speed >= 0) {
						((PShip) obj).PSincreaseSpeed();
						System.out.println("PS speed incremented: ");
						System.out.println(obj);
					}

				}

			}
		} else {
			System.out.println("Player ship does not exist");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}

		/*
		 * if (PlayerShipExists()) { for (GameObject obj : objectCollection) { if (obj
		 * instanceof PShip) { int speed = ((PShip) obj).getspeed(); if (speed > 15) {
		 * 
		 * } else if (speed >= 0) { ((PShip) obj).increaseSpeed();
		 * System.out.println("Speed increased"); } } }
		 * 
		 * } else { System.out.println("ship dne"); }
		 */
	}

	public void decreaseSpeedPS() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					int speed = ((PShip) obj).getspeed();
					if (speed == 0) {
						System.out.println("Can't go any slower.");
					} else if (speed > 0) {
						((PShip) obj).PSdecreaseSpeed();
						System.out.println("PS speed decremented: ");
						System.out.println(obj);
					}

				}

			}
		} else {
			System.out.println("Player ship does not exist");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}

	}

	public void turnPSLeft() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					System.out.println("Turn left. Heading changed by -10");
					((PShip) obj).changeHeading(-10);

				}

			}
		} else {
			System.out.println("turn left did not execute. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void turnPSRight() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					System.out.println("Turn right. Heading changed by +10");
					((PShip) obj).changeHeading(10);

				}

			}
		} else {
			System.out.println("turn right did not execute. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void turnMissleLauncherRight() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					System.out.println("Turn PSLauncher right. Heading changed by +5");
					SteerableLauncher launcher = ((PShip) obj).getPsMissleLauncher();
					launcher.changeHeading(5);

				}

			}
		} else {
			System.out.println("Turn PSLauncher right did not execute. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}
	public void turnMissleLauncherLeft() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					System.out.println("Turn PSLauncher left . Heading changed by -5");
					SteerableLauncher launcher = ((PShip) obj).getPsMissleLauncher();
					launcher.changeHeading(-5);

				}

			}
		} else {
			System.out.println("Turn PSLauncher left did not execute. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}
	public void fireMisslePS() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					int missileCount = ((PShip) obj).getMissleCount();
					if (missileCount < 1) {
						System.out.println("PS out of missile ammo");
					} else {
						((PShip) obj).setMissleCount(missileCount - 1);
						Missile m = new Missile(obj.getX(), obj.getY(), ((PShip) obj).getHeading(),
								((PShip) obj).getspeed());
						GameObjCollection.add(m);
						System.out.println("PS missile fired.");

					}

				}

			}
		} else {
			System.out.println("Missile unable to fire. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
		/*
		 * if (PlayerShipExists()) { int i = PSLocationInVector(); int missileCount;
		 * PShip ship = (PShip) objectCollection.get(i);
		 * 
		 * missileCount = ship.getMissleCount();
		 * 
		 * if (missileCount > 0) { ship.setMissleCount(missileCount - 1);
		 * SteerableLauncher sl = ship.getPsMissleLauncher(); Missile missile = new
		 * Missile(ship.getX(), ship.getY(), ship.getHeading(), ship.getspeed());
		 * objectCollection.add(missile);
		 * 
		 * } else { System.out.println("out of missles");
		 * 
		 * }
		 * 
		 * } else { System.out.println(" ship dne "); }
		 */
	}

	public void fireMissleNPS() {
		IItterator it = GameObjCollection.getIterator();
		if (NonPlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof NPShip) {
					int missileCount = ((NPShip) obj).getMissleCount();
					if (missileCount < 1) {
						System.out.println("NPS out of missile ammo");
					} else {
						((NPShip) obj).setMissleCount(missileCount - 1);
						Missile m = new Missile(obj.getX(), obj.getY(), ((NPShip) obj).getHeading(),
								((NPShip) obj).getspeed());
						GameObjCollection.add(m);
						System.out.println("NPS missile fired.");

					}

				}

			}
		} else {
			System.out.println("Missile unable to fire. Did you add NPS ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void jumpHyperspace() {
		int x = 512;
		int y = 384;

		IItterator it = GameObjCollection.getIterator();
		if (NonPlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					obj.setX(x);
					obj.setY(y);
					SteerableLauncher launcher = ((PShip) obj).getPsMissleLauncher();
					launcher.setX(x);
					launcher.setY(y);
					System.out.println("PS jumped to the middle");
				}

			}
		} else {
			System.out.println("Jump not possible. Did you add ship?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void loadNewMisslesPS() {
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof PShip) {
					((PShip) obj).setMissleCount(10);
					System.out.println("PS reloaded with 10 missiles");
				}

			}
		} else {
			System.out.println("Missiles not able to reload. Does ps exist?");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void missleStrikePStoAs() {
		if (missileExists() && asteroidExists()) {
			deleteAsteroid();
			deleteMissile();
			score += 1;
			System.out.println("asteroid and missle removed. Missle struck asteroid.");
		} else {
			System.out.println("did not strike asteroid ");
		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void missleStrikePStoNPS() {
		if (PlayerShipExists() && NonPlayerShipExists()) {
			deleteNPS();
			deleteMissile();
			score += 6;
			System.out.println(" missile strikes nps. NPS and missile removed. ");
		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void missleStrikeNPStoPS() {
		if (PlayerShipExists() && NonPlayerShipExists()) {
			decrementPSLife();
			deletePS();
			deleteMissile();
			System.out.println("NPS missile strikes PS. Ps deleted.");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}
	}

	public void crashPStoAs() {
		if (PlayerShipExists() && asteroidExists()) {
			deletePS();
			decrementPSLife();
			deleteAsteroid();
			System.out.println("crash PS to AS . removed ps and asteroid ");
		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void crashPStoNPS() {
		if (PlayerShipExists() && NonPlayerShipExists()) {
			deleteNPS();
			decrementPSLife();
			deletePS();
			System.out.println("removed ps and asteroid ");
		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void crashAstoAs() {
		if (asteroidExists()) {

			deleteAsteroid();
			System.out.println("removed 1 asteroid");
			if (asteroidExists()) {

				deleteAsteroid();
				System.out.println("removed 2 asteroid");

			} else {
				System.out.println("2nd asteroid does not exist.");
			}
		} else {
			System.out.println("Collision between asteroids was not executed. ");

		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));

	}

	public void crashAstoNPS() {
		if (asteroidExists() && NonPlayerShipExists()) {
			deleteNPS();
			deleteAsteroid();
			System.out.println(" AS and NPS collsion. removed nps and asteroid ");

		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void clockTicked() {
		System.out.println(" - - - - -TICK - - - - ");
		moveObjects();
		changeFuel();
		blinkSpaceStation();
		ticks++;
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void moveObjects() {
		boolean moving = false;
		IItterator it = GameObjCollection.getIterator();
		if (PlayerShipExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof IMovable) {
					((IMovable) obj).move();

				}

			}
		} else {
			System.out.println("Missiles not able to reload. Does ps exist?");

		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));

		// moving steerablemissle for PS

	}

	public void changeFuel() {
		IItterator it = GameObjCollection.getIterator();
		LinkedList<Missile> emptyMissiles = new LinkedList<>();
		if (missileExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				// MIGHT NOT WORK. TESTING NEEDED.
				if (obj instanceof Missile) {
					Missile m = (Missile) obj;
					int fuel = m.getFuel();
					if (((Missile) obj).getFuel() < 1) {
						emptyMissiles.add((Missile) obj);
						System.out.println(" missile added to remove.  ");
					} else {
						((Missile) obj).setFuel(fuel - 1);
						System.out.println("Missile fuel decremented. ");
					}
				}

			}
			for (Missile m : emptyMissiles) {
				GameObjCollection.delete(m);
			}

		} else {
			System.out.println("Change ");
			this.setChanged();
			this.notifyObservers(new GameWorldProxy(this));
		}

	}

	public void blinkSpaceStation() {
		IItterator it = GameObjCollection.getIterator();
		if (spaceStationExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if (obj instanceof SpaceStation) {
					((SpaceStation) obj).blinkLight();
					System.out.println("space station light changed. ");

				}

			}
		} else {
			System.out.println("Space station unable to blink. ");

		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}
/*
	public void printState() {
		if (PlayerShipExists()) {
			int i = PSLocationInVector();
			PShip Ship = (PShip) objectCollection.get(i);
			int missleCount = Ship.getMissleCount();

			System.out.println(" PLAYER SHIP MISSLE COUNT: " + missleCount);
		}
		System.out.println("SCORE : " + score + " Time is at : " + ticks);
	}
*/
	public void printMap() {
		IItterator it = GameObjCollection.getIterator();
		System.out.println("###########################<<MAP>>>############################");
		if (spaceStationExists()) {
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				System.out.println("obj");

			}
		} else {
			System.out.println("Unable to execute printmap command. ");

		}
		this.setChanged();
		this.notifyObservers(new GameWorldProxy(this));
	}

	public void quitGame() {
		System.exit(0);
	}

	@Override
	public int getlives() {
		// TODO Auto-generated method stub
		return this.lives;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub

		return this.score;
	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return this.ticks;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.height = height;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public boolean getSound() {
		// TODO Auto-generated method stub
		return this.sound;
	}

	@Override
	public int getNumberOfMissiles() {
		int numOfMissiles = 0; 
		IItterator it = GameObjCollection.getIterator();
		
			while (it.hasNext()) {
				GameObject obj = (GameObject) it.getNext();
				if(obj instanceof Missile) {
				numOfMissiles++;
				}
			}
			
		return numOfMissiles; 

	}

}
