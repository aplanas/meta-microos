SUMMARY = "Points on a path through the 2-D plane"
DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position '$n' to and from coordinates '$x,$y' in the 2D plane. \
 \
The current classes include the following. The intention is that any \
'Math::PlanePath::Something' is a PlanePath, and supporting base classes or \
related things are further down like 'Math::PlanePath::Base::Xyzzy'. \
 \
    SquareSpiral           four-sided spiral \
    PyramidSpiral          square base pyramid \
    TriangleSpiral         equilateral triangle spiral \
    TriangleSpiralSkewed   equilateral skewed for compactness \
    DiamondSpiral          four-sided spiral, looping faster \
    PentSpiral             five-sided spiral \
    PentSpiralSkewed       five-sided spiral, compact \
    HexSpiral              six-sided spiral \
    HexSpiralSkewed        six-sided spiral skewed for compactness \
    HeptSpiralSkewed       seven-sided spiral, compact \
    AnvilSpiral            anvil shape \
    OctagramSpiral         eight pointed star \
    KnightSpiral           an infinite knight's tour \
    CretanLabyrinth        7-circuit extended infinitely \
 \
    SquareArms             four-arm square spiral \
    DiamondArms            four-arm diamond spiral \
    AztecDiamondRings      four-sided rings \
    HexArms                six-arm hexagonal spiral \
    GreekKeySpiral         square spiral with Greek key motif \
    MPeaks                 'M' shape layers \
 \
    SacksSpiral            quadratic on an Archimedean spiral \
    VogelFloret            seeds in a sunflower \
    TheodorusSpiral        unit steps at right angles \
    ArchimedeanChords      unit chords on an Archimedean spiral \
    MultipleRings          concentric circles \
    PixelRings             concentric rings of midpoint pixels \
    FilledRings            concentric rings of pixels \
    Hypot                  points by distance \
    HypotOctant            first octant points by distance \
    TriangularHypot        points by triangular distance \
    PythagoreanTree        X^2+Y^2=Z^2 by trees \
 \
    PeanoCurve             3x3 self-similar quadrant \
    PeanoDiagonals         across unit squares \
    WunderlichSerpentine   transpose parts of PeanoCurve \
    HilbertCurve           2x2 self-similar quadrant \
    HilbertSides           along sides of unit squares \
    HilbertSpiral          2x2 self-similar whole-plane \
    ZOrderCurve            replicating Z shapes \
    GrayCode               Gray code splits \
    WunderlichMeander      3x3 'R' pattern quadrant \
    BetaOmega              2x2 self-similar half-plane \
    AR2W2Curve             2x2 self-similar of four parts \
    KochelCurve            3x3 self-similar of two parts \
    DekkingCurve           5x5 self-similar, edges \
    DekkingCentres         5x5 self-similar, centres \
    CincoCurve             5x5 self-similar \
 \
    ImaginaryBase          replicate in four directions \
    ImaginaryHalf          half-plane replicate three directions \
    CubicBase              replicate in three directions \
    SquareReplicate        3x3 replicating squares \
    CornerReplicate        2x2 replicating 'U' \
    LTiling                self-similar L shapes \
    DigitGroups            digits grouped by zeros \
    FibonacciWordFractal   turns by Fibonacci word bits \
 \
    Flowsnake              self-similar hexagonal tile traversal \
    FlowsnakeCentres         likewise but centres of hexagons \
    GosperReplicate        self-similar hexagonal tiling \
    GosperIslands          concentric island rings \
    GosperSide             single side or radial \
 \
    QuintetCurve           self-similar '+' traversal \
    QuintetCentres           likewise but centres of squares \
    QuintetReplicate       self-similar '+' tiling \
 \
    DragonCurve            paper folding \
    DragonRounded          paper folding rounded corners \
    DragonMidpoint         paper folding segment midpoints \
    AlternatePaper         alternating direction folding \
    AlternatePaperMidpoint alternating direction folding, midpoints \
    TerdragonCurve         ternary dragon \
    TerdragonRounded       ternary dragon rounded corners \
    TerdragonMidpoint      ternary dragon segment midpoints \
    AlternateTerdragon     alternate ternary dragon \
    R5DragonCurve          radix-5 dragon curve \
    R5DragonMidpoint       radix-5 dragon curve midpoints \
    CCurve                 'C' curve \
    ComplexPlus            base i+realpart \
    ComplexMinus           base i-realpart, including twindragon \
    ComplexRevolving       revolving base i+1 \
 \
    SierpinskiCurve        self-similar right-triangles \
    SierpinskiCurveStair   self-similar right-triangles, stair-step \
    HIndexing              self-similar right-triangles, squared up \
 \
    KochCurve              replicating triangular notches \
    KochPeaks              two replicating notches \
    KochSnowflakes         concentric notched 3-sided rings \
    KochSquareflakes       concentric notched 4-sided rings \
    QuadricCurve           eight segment zig-zag \
    QuadricIslands           rings of those zig-zags \
    SierpinskiTriangle     self-similar triangle by rows \
    SierpinskiArrowhead    self-similar triangle connectedly \
    SierpinskiArrowheadCentres  likewise but centres of triangles \
 \
    Rows                   fixed-width rows \
    Columns                fixed-height columns \
    Diagonals              diagonals between X and Y axes \
    DiagonalsAlternating   diagonals Y to X and back again \
    DiagonalsOctant        diagonals between Y axis and X=Y centre \
    Staircase              stairs down from the Y to X axes \
    StaircaseAlternating   stairs Y to X and back again \
    Corner                 expanding stripes around a corner \
    CornerAlternating      expanding up and down around a corner \
    PyramidRows            expanding stacked rows pyramid \
    PyramidSides           along the sides of a 45-degree pyramid \
    CellularRule           cellular automaton by rule number \
    CellularRule54         cellular automaton rows pattern \
    CellularRule57         cellular automaton (rule 99 mirror too) \
    CellularRule190        cellular automaton (rule 246 mirror too) \
    UlamWarburton          cellular automaton diamonds \
    UlamWarburtonQuarter   cellular automaton quarter-plane \
 \
    DiagonalRationals      rationals X/Y by diagonals \
    FactorRationals        rationals X/Y by prime factorization \
    GcdRationals           rationals X/Y by rows with GCD integer \
    RationalsTree          rationals X/Y by tree \
    FractionsTree          fractions 0<X/Y<1 by tree \
    ChanTree               rationals X/Y multi-child tree \
    CfracDigits            continued fraction 0<X/Y<1 by digits \
    CoprimeColumns         coprime X,Y \
    DivisibleColumns       X divisible by Y \
    WythoffArray           Fibonacci recurrences \
    WythoffPreliminaryTriangle \
    PowerArray             powers in rows \
    File                   points from a disk file \
 \
And in the separate Math-PlanePath-Toothpick distribution \
 \
    ToothpickTree          pattern of toothpicks \
    ToothpickReplicate     same by replication rather than tree \
    ToothpickUpist         toothpicks only growing upwards \
    ToothpickSpiral        toothpicks around the origin \
 \
    LCornerTree            L-shape corner growth \
    LCornerReplicate       same by replication rather than tree \
    OneOfEight \
    HTree                  H shapes replicated \
 \
The paths are object oriented to allow parameters, though many have none. \
See 'examples/numbers.pl' in the Math-PlanePath sources for a sample \
printout of numbers from selected paths or all paths."
LICENSE = "GPL-3.0-or-later"

PV = "129"

RPM_NAME = "perl-Math-PlanePath-129-1.10.aarch64.rpm"
RPM_HASH = "77b3daf3e4fac6cadffd72c6c0a4b4ea6cfe2a5cec755f5b1ac8f5d8e532dbdf4cfe3c27686fa94074fb9b19398e99538459a534d61607f2879bfbce3473b836"

RPROVIDES:${PN} += "perl(Math::NumSeq::OEIS::Catalogue::Plugin::PlanePath) \
perl(Math::NumSeq::PlanePathCoord) \
perl(Math::NumSeq::PlanePathDelta) \
perl(Math::NumSeq::PlanePathN) \
perl(Math::NumSeq::PlanePathTurn) \
perl(Math::PlanePath) \
perl(Math::PlanePath::AR2W2Curve) \
perl(Math::PlanePath::AlternatePaper) \
perl(Math::PlanePath::AlternatePaperMidpoint) \
perl(Math::PlanePath::AlternateTerdragon) \
perl(Math::PlanePath::AnvilSpiral) \
perl(Math::PlanePath::ArchimedeanChords) \
perl(Math::PlanePath::AztecDiamondRings) \
perl(Math::PlanePath::Base::Digits) \
perl(Math::PlanePath::Base::Generic) \
perl(Math::PlanePath::Base::NSEW) \
perl(Math::PlanePath::BetaOmega) \
perl(Math::PlanePath::CCurve) \
perl(Math::PlanePath::CellularRule) \
perl(Math::PlanePath::CellularRule190) \
perl(Math::PlanePath::CellularRule54) \
perl(Math::PlanePath::CellularRule57) \
perl(Math::PlanePath::CellularRule::Line) \
perl(Math::PlanePath::CellularRule::OddSolid) \
perl(Math::PlanePath::CellularRule::OneTwo) \
perl(Math::PlanePath::CellularRule::Two) \
perl(Math::PlanePath::CfracDigits) \
perl(Math::PlanePath::ChanTree) \
perl(Math::PlanePath::CincoCurve) \
perl(Math::PlanePath::Columns) \
perl(Math::PlanePath::ComplexMinus) \
perl(Math::PlanePath::ComplexPlus) \
perl(Math::PlanePath::ComplexRevolving) \
perl(Math::PlanePath::CoprimeColumns) \
perl(Math::PlanePath::Corner) \
perl(Math::PlanePath::CornerAlternating) \
perl(Math::PlanePath::CornerReplicate) \
perl(Math::PlanePath::CretanLabyrinth) \
perl(Math::PlanePath::CubicBase) \
perl(Math::PlanePath::DekkingCentres) \
perl(Math::PlanePath::DekkingCurve) \
perl(Math::PlanePath::DiagonalRationals) \
perl(Math::PlanePath::Diagonals) \
perl(Math::PlanePath::DiagonalsAlternating) \
perl(Math::PlanePath::DiagonalsOctant) \
perl(Math::PlanePath::DiamondArms) \
perl(Math::PlanePath::DiamondSpiral) \
perl(Math::PlanePath::DigitGroups) \
perl(Math::PlanePath::DivisibleColumns) \
perl(Math::PlanePath::DragonCurve) \
perl(Math::PlanePath::DragonMidpoint) \
perl(Math::PlanePath::DragonRounded) \
perl(Math::PlanePath::FactorRationals) \
perl(Math::PlanePath::FibonacciWordFractal) \
perl(Math::PlanePath::File) \
perl(Math::PlanePath::FilledRings) \
perl(Math::PlanePath::Flowsnake) \
perl(Math::PlanePath::FlowsnakeCentres) \
perl(Math::PlanePath::FractionsTree) \
perl(Math::PlanePath::GcdRationals) \
perl(Math::PlanePath::GosperIslands) \
perl(Math::PlanePath::GosperReplicate) \
perl(Math::PlanePath::GosperSide) \
perl(Math::PlanePath::GrayCode) \
perl(Math::PlanePath::GreekKeySpiral) \
perl(Math::PlanePath::HIndexing) \
perl(Math::PlanePath::HeptSpiralSkewed) \
perl(Math::PlanePath::HexArms) \
perl(Math::PlanePath::HexSpiral) \
perl(Math::PlanePath::HexSpiralSkewed) \
perl(Math::PlanePath::HilbertCurve) \
perl(Math::PlanePath::HilbertSides) \
perl(Math::PlanePath::HilbertSpiral) \
perl(Math::PlanePath::Hypot) \
perl(Math::PlanePath::HypotOctant) \
perl(Math::PlanePath::ImaginaryBase) \
perl(Math::PlanePath::ImaginaryHalf) \
perl(Math::PlanePath::KnightSpiral) \
perl(Math::PlanePath::KochCurve) \
perl(Math::PlanePath::KochPeaks) \
perl(Math::PlanePath::KochSnowflakes) \
perl(Math::PlanePath::KochSquareflakes) \
perl(Math::PlanePath::KochelCurve) \
perl(Math::PlanePath::LTiling) \
perl(Math::PlanePath::MPeaks) \
perl(Math::PlanePath::MultipleRings) \
perl(Math::PlanePath::OctagramSpiral) \
perl(Math::PlanePath::PeanoCurve) \
perl(Math::PlanePath::PeanoDiagonals) \
perl(Math::PlanePath::PentSpiral) \
perl(Math::PlanePath::PentSpiralSkewed) \
perl(Math::PlanePath::PixelRings) \
perl(Math::PlanePath::PowerArray) \
perl(Math::PlanePath::PyramidRows) \
perl(Math::PlanePath::PyramidSides) \
perl(Math::PlanePath::PyramidSpiral) \
perl(Math::PlanePath::PythagoreanTree) \
perl(Math::PlanePath::QuadricCurve) \
perl(Math::PlanePath::QuadricIslands) \
perl(Math::PlanePath::QuintetCentres) \
perl(Math::PlanePath::QuintetCurve) \
perl(Math::PlanePath::QuintetReplicate) \
perl(Math::PlanePath::R5DragonCurve) \
perl(Math::PlanePath::R5DragonMidpoint) \
perl(Math::PlanePath::RationalsTree) \
perl(Math::PlanePath::Rows) \
perl(Math::PlanePath::SacksSpiral) \
perl(Math::PlanePath::SierpinskiArrowhead) \
perl(Math::PlanePath::SierpinskiArrowheadCentres) \
perl(Math::PlanePath::SierpinskiCurve) \
perl(Math::PlanePath::SierpinskiCurveStair) \
perl(Math::PlanePath::SierpinskiTriangle) \
perl(Math::PlanePath::SquareArms) \
perl(Math::PlanePath::SquareReplicate) \
perl(Math::PlanePath::SquareSpiral) \
perl(Math::PlanePath::Staircase) \
perl(Math::PlanePath::StaircaseAlternating) \
perl(Math::PlanePath::TerdragonCurve) \
perl(Math::PlanePath::TerdragonMidpoint) \
perl(Math::PlanePath::TerdragonRounded) \
perl(Math::PlanePath::TheodorusSpiral) \
perl(Math::PlanePath::TriangleSpiral) \
perl(Math::PlanePath::TriangleSpiralSkewed) \
perl(Math::PlanePath::TriangularHypot) \
perl(Math::PlanePath::UlamWarburton) \
perl(Math::PlanePath::UlamWarburtonQuarter) \
perl(Math::PlanePath::VogelFloret) \
perl(Math::PlanePath::WunderlichMeander) \
perl(Math::PlanePath::WunderlichSerpentine) \
perl(Math::PlanePath::WythoffArray) \
perl(Math::PlanePath::WythoffPreliminaryTriangle) \
perl(Math::PlanePath::ZOrderCurve) \
perl-Math-PlanePath \
perl-Math-PlanePath(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Math::Libm) \
perl(constant::defer)"

inherit rpm
