import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Cubekaka {

    private int x;
    private int y;
    private int width;
    private int height;
    private double angle;
    private Color color;

    public Cubekaka(final int x, final int y, final int width, final int height, final double angle, final Color color) {
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
        double[] doubleArrayX;
        double[] doubleArrayY;

        Color mainColor = new Color(99, 57, 9);
        Color lighterBrown = new Color(187, 145, 98);
        Color lightestBrown = new Color(201, 167, 131);
        Color branch01 = new Color(92, 151, 61);
        Color branch02 = new Color(139, 196, 64);

        //branch02
        values = new double[][]{
                {-18.89908,-3.57296  },
                {-33.61396,-3.38491  },
                {-27.36132,-7.1459   },
                {-22.56603,-8.086163 },
                {-25.01069,-12.223264},
                {-24.16447,-14.667914},
                {-16.26636,-14.291784},
                {-17.39464,-20.497491},
                {-9.6846,-19.651249  },
                {-4.5132,-16.36038404},
                {-12.12925,0.094034  },
                {3.10283,13.82169804 },
                {9.87265,23.224204   },
                {9.40252,13.821697   },
                {16.26635,16.924509  },
                {16.64244,13.351541  },
                {21.90786,13.915733  },
                {25.7629,11.847143   },
                {32.34465,10.90693   },
                {15.60817,4.32515    },
                {22.56605,4.41919    },
                {17.86477,2.53868    },
                {20.21542,0.84621    },
        };

        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 525.0;
        doubleArrayY[0] = 120.0;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setColor(branch01);
        g.fillPolygon(arrayX, arrayY, arrayX.length);

        AffineTransform startState = g.getTransform();

        angle = 0.5*Math.sin(0.17*angle);
        g.rotate(angle, 546, 120);
        AffineTransform oldState;
        AffineTransform rotated = g.getTransform();

        //g.rotate(-0.5, 546, 123);

        //gr.drawPolygon(arrayX, arrayY, 8);

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

        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 515.0;
        doubleArrayY[0] = 230.0;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setColor(mainColor);
        g.fillPolygon(arrayX, arrayY, arrayX.length);

        oldState = g.getTransform();
        g.setTransform(startState);
        //branch01
        values = new double[][]{
                {-0.0304, 10.18235},
                {34.62772, -0.59294},
                {47.47086, -6.64858},
                {34.7056, -9.44099},
                {37.498, -13.962033},
                {25.79654, -12.366347},
                {37.76393, -22.339185},
                {25.66353, -17.951173},
                {25.13163, -21.54141},
                {25.53056, -24.73272966},
                {-15.9566, -0.39890948},
                {-18.35009, 17.55226014},
                {-29.38672, 24.067871},
                {-23.80194, 16.488481},
                {-29.65265, 18.084091},
                {-25.66352, 11.96745},
                {-24.59976, 10.105851},
                {-25.79653, 7.845313},
                {-22.0733, 4.91996},
                {-33.37589, 6.11668},
                {-24.99867, 1.99458},
        };


        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 525.0;
        doubleArrayY[0] = 120.0;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setColor(branch01);
        g.fillPolygon(arrayX, arrayY, arrayX.length);
        g.setTransform(oldState);



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
        //branch_03
        values = new double[][]{
        {5.0582,16.88338684   },
        {11.6885,20.437792    },
        {16.74666,17.77199    },
        {27.20479,18.660544   },
        {31.10105,12.508737   },
        {23.85546,6.767033    },
        {23.24027,4.16958     },
        {26.52131,0.95696     },
        {23.03522,-1.43543    },
        {33.90351,-6.288553   },
        {15.99479,-4.64806    },
        {21.8732,-8.885996    },
        {23.71876,-11.27834   },
        {24.94915,-15.92643   },
        {26.99974,-20.232731  },
        {20.09601,-18.933997  },
        {10.25308,-10.59484784},
        {-15.72136,-0.4784695 },
        {-18.04539,17.63527434},
        {-21.4631,17.020102   },
        {-22.14664,15.242902  },
        {-27.27319,14.764418  },
        {-29.59715,11.551749  },
        {-24.94915,6.698666   },
        {-20.16438,3.486057   },
        {-22.28334,1.367074   },
        {-21.053,-0.683532    },
        {-23.71876,-3.89618   },
        {-19.95931,-5.605011  },
        {-19.13908,-6.972069  },
        {-13.67075,-7.177116  },
        {-14.42268,-8.270816  },
        {-14.83277,-12.030274 },
        {-9.91128,-11.21002   },
        {-8.20249,-12.09863   },
        {-4.85311,-11.3467303 },
        {-2.18732,-8.06575264 }
        };
        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 633.73;
        doubleArrayY[0] = 0.56;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setTransform(startState);
        g.setColor(branch02);
        g.fillPolygon(arrayX, arrayY, arrayX.length);
        g.setTransform(rotated);

        //branch_03_leaf_01
        values = new double[][]{
                {-9.15946,4.579705  },
                {-10.32138,7.177158 },
                {-4.03291,-4.784777 },
                {-6.42524,-4.306288 },
                {-8.27082,-0.06834  },
                {-12.16698,5.331592 },
                {-16.06312,14.149245},
                {-12.16702,18.250462},
                {-4.23792,12.098586 },
                {-0.68353,14.83278  },
                {2.11898,14.285922  },
                {2.87085,10.66321   },
                {17.84034,-12.987223},
                {20.02765,-13.465697},
                {15.78974,-9.911314 },
                {6.83538,-8.202415  },
                {3.41771,-9.979638  },
                {0.47844,-10.389784 },
                {-3.21262,-9.911306 },
                {11.41511,-8.475872 },
                {8.54421,-4.237934  },
        };
        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 639.81;
        doubleArrayY[0] = 19.9;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setTransform(startState);
        g.setColor(branch02);
        g.fillPolygon(arrayX, arrayY, arrayX.length);
        g.setTransform(rotated);

        //branch_03_leaf_02
        values = new double[][]{
                {-11.50335,10.730018},
                {-13.34001,13.726694},
                {8.21669,10.82669   },
                {4.73665,12.5667    },
                {1.64337,14.40336   },
                {-4.25338,11.40669  },
                {-11.50334,12.56671 },
                {-15.27336,15.1767  },
                {-14.88669,17.01336 },
                {-11.98672,14.11338 },
                {-3.38335,4.35      },
                {-2.80334,-4.83333  },
                {-8.60335,-13.92005 },
                {-8.40998,-15.7567  },
                {-4.73669,-19.62337 },
                {0.77334,-15.85337  },
                {5.70333,-17.98005  },
                {7.92666,-15.46669  },
                {7.73337,-10.15004  },
                {5.41335,-4.543333  },
                {29.09673,-5.316668 },
                {8.7,6.573348       },
                {11.98671,-12.760037},
        };
        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 892.23;
        doubleArrayY[0] = 78.30;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setTransform(startState);
        g.setColor(branch02);
        g.fillPolygon(arrayX, arrayY, arrayX.length);
        g.setTransform(rotated);

        //branch_03_leaf_03
        values = new double[][]{
                {1.36706,7.17716   },
                {3.75944,9.637876  },
                {2.05064,3.486057  },
                {17.97706,0.136714 },
                {10.59477,3.280977 },
                {7.24552,6.561963  },
                {5.46837,12.30367  },
                {9.09104,22.69348  },
                {8.81757,18.25047  },
                {-11.27839,0.88859 },
                {-18.59218,-0.68353},
                {-9.97964,-1.91391 },
                {-9.63788,-3.96452 },
                {-14.14924,-11.0733},
                {-8.47589,-10.45812},
                {-4.85311,-8.886   },
                {-1.70888,-9.09105 },
                {2.18736,-8.27082  },
                {4.98983,-4.784753 },
                {7.24548,-3.00756  },
                {-4.51134,-9.706255},
                {-2.18731,-6.425257},
                {-0.75187,-3.827813},
        };
        doubleArrayX = new double[values.length + 1];
        doubleArrayY = new double[values.length + 1];
        doubleArrayX[0] = 906.67;
        doubleArrayY[0] = 71.85;
        for (int i = 0; i < values.length; i++) {
            doubleArrayX[i + 1] = doubleArrayX[i] + values[i][0];
            doubleArrayY[i + 1] = doubleArrayY[i] + values[i][1];
        }
        arrayX = new int[values.length+1];
        arrayY = new int[values.length+1];
        for (int i = 0; i < doubleArrayY.length; i++) {
            arrayX[i] = (int) doubleArrayX[i];
            arrayY[i] = (int) doubleArrayY[i];
        }
        g.setTransform(startState);
        g.setColor(branch02);
        g.fillPolygon(arrayX, arrayY, arrayX.length);
        g.setTransform(rotated);

    }
}