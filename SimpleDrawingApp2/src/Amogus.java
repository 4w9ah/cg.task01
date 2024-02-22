import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Amogus {

    private int x;
    private int y;
    private int width;
    private int height;
    private double angle;
    private Color color;

    public Amogus(final int x, final int y, final int width, final int height, final double angle, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = angle;
//        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        double[][] values;
        int[] arrayX;
        int[] arrayY;

        angle = 0.5*Math.sin(0.17*angle);
        g.rotate(angle, 546, 123);
        //g.rotate(-0.5, 546, 123);

        Color mainColor = new Color(99, 57, 9);
        Color lighterBrown = new Color(187, 145, 98);
        Color lightestBrown = new Color(201, 167, 131);
        //gr.drawPolygon(arrayX, arrayY, 8);

        AffineTransform oldState = g.getTransform();

        g.setColor(mainColor);
        g.fillOval(332, 237, 91, 84); //l_ear_outer

        g.setColor(lighterBrown);
        g.fillOval(346, 252, 61, 57); //l_ear_inner

        //r_ear_outer
        g.setColor(mainColor);
        g.fillOval(549, 283, 91, 84); //r_ear_outer

        g.setColor(lighterBrown);
        g.fillOval(563, 298, 61, 55); //r_ear_inner

        //gr.drawOval(90,111,17,10);


        //tail
        values = new double[][]{
                {7.60553,-8.34155   },
                {10.42694,-16.80576 },
                {6.74684,-15.4564   },
                {3.18942,-11.89897  },
                {1.10403,-17.17377  },
                {-0.4907,-9.32291   },
                {-1.84004,-9.3229   },
                {-5.27479,-10.1816  },
                {-6.74685,-9.69091  },
                {-7.36017,-6.746841 },
                {-9.07757,-4.784121 },
                {-9.56826,-1.104027 },
                {-8.83221,2.576065  },
                {-7.11486,3.802764  },
                {-4.41611,7.11485   },
                {-0.98136,9.20023   },
                {1.71738,5.52015    },
                {4.41611,1.47203    },
                {2.69875,-1.84004   },
                {2.20805,-2.33073   },
                {3.92544,-0.12267   },
                {2.57606,2.20806    },
                {0.49067,4.53878    },
                {-3.68009,3.55742   },
                {-5.76548,2.94408   },
                {-6.01083,0.73602   },
                {-3.80275,-0.98136  },
                {-3.92544,-3.00541  },
                {-3.61876,-4.60012  },
                {-1.90137,-9.50691  },
                {1.34935,-10.12026  },
                {5.02946,-9.261569  },
                {8.46423,-5.704146  },
                {11.28562,-5.213467 },
                {13.73902,-0.184004 },
                {10.05893,3.189414  },
                {9.38424,5.704147   },
                {10.85628,12.082975 },
                {5.88814,10.30426   },
                {2.69872,7.85087    },
                {2.0854,8.52555     },
                {1.28804,6.3175     },
                {0.36801,16.06974   },
                {-3.68009,18.33914  },
                {-5.27481,13.86169  },
                {-7.0535,14.29103   },
                {-5.9495,8.77089    },
                {-7.23752,8.77089   }
        };
        arrayX = new int[values.length + 1];
        arrayY = new int[values.length + 1];
        arrayX[0] = 515;
        arrayY[0] = 230;
        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }
        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, arrayX.length);


        //r_leg
        //r_feet
        g.setColor(lighterBrown);
        g.fillOval(578, 192, 36, 36);
        //r_toe04
        g.fillOval(606, 192, 17, 17);
        //r_toe03
        g.fillOval(592, 182, 17, 17);
        //r_toe02
        g.fillOval(576, 188, 17, 17);
        //r_toe01
        g.fillOval(569, 204, 17, 17);

        //r_leg
        values = new double[][]{
                {18.05284, -4.13712},
                {7.61604, -2.6327},
                {4.51322, -2.44465},
                {4.13708, -6.58177},
                {1.59843, -4.88931},
                {9.40252, -5.92357},
                {7.8981, -1.69247},
                {6.86386, 0.94026},
                {6.48773, 4.88931},
                {2.6327, 7.99213},
                {-1.03426, 6.48774},
                {-4.60726, 7.80409},
                {-7.33394, 8.36824},
                {-7.89814, 6.20566},
                {-9.96668, 5.07737},
                {-6.48773, 1.78647},
                {-8.46225, 0.94025},
                {-9.12042, -0.65818},
                {-8.73544, -0.56416}
        };
        arrayX = new int[values.length + 1];
        arrayY = new int[values.length + 1];
        arrayX[0] = 547;
        arrayY[0] = 233;
        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }
        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, arrayX.length);


        //l_feet
        g.setColor(lighterBrown);
        g.fillOval(418, 167, 36, 36);
        //l_toe04
        g.fillOval(445, 187, 17, 17);
        //l_toe03
        g.fillOval(446, 170, 17, 17);
        //l_toe02
        g.fillOval(434, 157, 17, 17);
        //l_toe01
        g.fillOval(417, 159, 17, 17);
        //l_leg
        values = new double[][]{
                {-15.79623, -6.20566},
                {-10.15472, -7.33396},
                {-7.05188, -9.49654},
                {-4.41918, -11.5651},
                {-1.59843, -12.31729},
                {1.03428, -8.93239},
                {6.7698, -7.61604},
                {9.02642, -2.53868},
                {6.39371, 1.59843},
                {6.11164, 4.70127},
                {6.29968, 9.87263},
                {-1.1283, 9.77862},
                {0.18806, 4.41918},
                {4.70125, 6.39371},
                {17.16354, 13.5651}};
        arrayX = new int[values.length + 1];
        arrayY = new int[values.length + 1];
        arrayX[0] = 454;
        arrayY[0] = 243;

        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }
        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, arrayX.length);

        //bottom
        g.setColor(mainColor);
        g.fillOval(445, 207, 115, 102);
        //head
        oldState = g.getTransform();
        g.setColor(mainColor);
        g.rotate(0.162518, 376 + 102, 258 + 82);
        g.fillOval(376, 258, 204, 165);
        g.setTransform(oldState);

        //mouth
        g.setColor(lighterBrown);
        oldState = g.getTransform();
        g.rotate(0.162518, 396 + 125, 336 + 47);
        g.fillOval(396, 336, 151, 94);
        g.setTransform(oldState);

        //lips
        values = new double[][]
                {
                        {2.6022,7.80666 },
                        {5.55141,4.51051 },
                        {8.06688,0.26022 },
                        {8.06688,-6.33206 },
                        {2.25526,1.30109 },
                        {-9.10775,6.67903},
                };

        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        arrayX[0] = 453;
        arrayY[0] = 381;

        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }

        g.setColor(Color.BLACK);
        g.fillPolygon(arrayX, arrayY, values.length);


        //l_hand
        //l_palm
        g.setColor(lightestBrown);
        g.fillOval(316, 357, 36, 32);
        //l_finger_04
        g.setColor(lighterBrown);
        g.fillOval(318, 345, 19, 19);

        //l_finger_03
        g.fillOval(303, 356, 19, 19);

        //l_finger_02
        g.fillOval(302, 371, 19, 19);

        //l_finger_02
        g.fillOval(310, 381, 19, 19);

        arrayX = new int[11];
        arrayY = new int[11];
        arrayX[0] = 342;
        arrayY[0] = 360;

        values = new double[][]
                {{18.35009, 0.66485},
                        {24.24682, -2.09241},
                        {13.4391, 21.66724},
                        {-10.91262, 6.38978},
                        {-16.28903, 4.72049},
                        {-21.47493, 1.52917},
                        {-10.50475, -0.13283},
                        {10.17232, -4.98644},
                        {5.00257, -6.88973},
                        {-0.74747, -10.86198}};

        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }

        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, 11);


        //r_hand

        //r_palm
        g.setColor(lightestBrown);
        g.fillOval(587, 382, 37, 37);

        //r_finger_04
        g.setColor(lighterBrown);
        g.fillOval(611, 377, 19, 19);

        //r_finger_03
        g.setColor(lighterBrown);
        g.fillOval(621, 390, 19, 19);

        //r_finger_02
        g.setColor(lighterBrown);
        g.fillOval(617, 405, 19, 19);

        //r_finger_01
        g.setColor(lighterBrown);
        g.fillOval(605, 414, 19, 19);


        arrayX = new int[13];
        arrayY = new int[13];
        arrayX[0] = 553;
        arrayY[0] = 398;
        values = new double[][]{{19.35227, 12.97334},
                {15.29175, 6.64857},
                {12.49933, 2.79241},
                {-5.71779, -4.52101},
                {-3.19131, -5.98373},
                {-0.53188, -7.04753},
                {2.26053, -6.38264},
                {5.05289, -5.4518},
                {6.06966, -3.21414},
                {-9.79285, -2.37068},
                {-11.43559, -3.05835},
                {-18.3433, -6.08263}
        };
        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }
        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, 13);

        //face
        values = new double[][]{
                {-1.31899, -14.46139},
                {2.1388, -11.90791},
                {5.90881, -10.84455},
                {9.91384, -9.7047},
                {14.11435, -5.54484},
                {18.48983, -0.20601},
                {14.21701, 3.60198},
                {8.707, 6.98534},
                {5.21205, 10.77173},
                {7.62273, -6.07271},
                {12.87476, -5.77445},
                {16.51439, 2.49533},
                {19.02714, 8.59961},
                {7.83747, 9.59121},
                {4.00969, 12.59872},
                {-1.31637, 20.30945},
                {-7.89809, 11.84716},
                {-3.00884, 3.76105}};
        arrayX = new int[values.length + 1];
        arrayY = new int[values.length + 1];
        arrayX[0] = 407;
        arrayY[0] = 348;

        for (int i = 0; i < values.length; i++) {
            arrayX[i + 1] = (int) (arrayX[i] + values[i][0]);
            arrayY[i + 1] = (int) (arrayY[i] + values[i][1]);
        }
        g.setColor(lighterBrown);
        Polygon poly = new Polygon(arrayX,arrayY, values.length);
        g.fillPolygon(poly);

        //l_eye
        g.setColor(Color.BLACK);
        g.fillOval(419,331, 20,20);

        //r_eye
        g.setColor(Color.BLACK);
        g.fillOval(512,348, 20,20);





//        // bag
//        g.setColor(this.color);
//        g.fillOval(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawOval(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height));
//
//        // head
//        g.setColor(this.color);
//        g.fillOval((int)(this.x + 0.2 * this.width), this.y, (int)(0.75 * this.width), (int)(0.5 * height));
//        g.setColor(Color.BLACK);
//        g.drawOval((int)(this.x + 0.2 * this.width), this.y, (int)(0.75 * this.width), (int)(0.5 * height));
//
//        // legs
//        g.setColor(this.color);
//        g.fillRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.fillRect((int)(this.x + 0.65 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.drawRect((int)(this.x + 0.65 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//
//        // body
//        g.setColor(this.color);
//        g.fillRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(0.75 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawLine((int)(this.x + 0.2 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(this.x + 0.2 * this.width), (int)(this.y + 0.75 * this.height));
//        g.drawLine((int)(this.x + 0.95 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(this.x + 0.95 * this.width), (int)(this.y + 0.75 * this.height));
//        g.drawLine((int)(this.x + 0.45 * this.width), (int)(this.y + 0.75 * this.height),
//                (int)(this.x + 0.7 * this.width),(int)(this.y + 0.75 * this.height));
//
//        // eyes
//        g.setColor(new Color(135,206,250));
//        g.fillOval((int)(this.x + 0.5 * this.width), (int)(this.y + 0.16 * this.height),
//                (int)(0.55 * this.width), (int)(0.25 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawOval((int)(this.x + 0.5 * this.width), (int)(this.y + 0.16 * this.height),
//                (int)(0.55 * this.width), (int)(0.25 * this.height));

    }
}