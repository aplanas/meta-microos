SUMMARY = "Python module to convert between color representations (RGB, HSL, web)"
DESCRIPTION = "Python module to convert between color representations: \
  * RGB, HSL, 6-digit hex, 3-digit hex, human color \
  * One object (Color) or several single purpose functions \
    (rgb2hex, hsl2rgb, ...) \
  * Web format which uses the smallest representation between \
    6-digit (e.g. #fa3b2c), 3-digit (e.g. #fbb), fully spelled \
    color (e.g. white), following W3C color naming for compatible \
    CSS or HTML color specifications \
  * Color scale generation choosing N color gradients \
  * It's possible to pick colors to identify objects of the \
    application being developed"
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "python310-colour-0.1.5-3.12.noarch.rpm"
RPM_HASH = "f2dff4b149add9ff36e4c8f31e8e3189b80e187532cb78a8b663767e16d24607aeb5b85ee1bb99f354760bd50c1f730ece6d117ad2d38189b5d94a9eff8df138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colour \
python3.10dist(colour) \
python310-colour \
python3dist(colour)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
