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

RPM_NAME = "python311-colour-0.1.5-3.12.noarch.rpm"
RPM_HASH = "82fa52fd1f50b28d56cbbd73a59571bb750db89227d8f284b09d2d98c6fa21c8f7fa910ae8f0ee7184395b26a321a70e35c5815d6d4c515ed3e915a1d9b66a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colour) python311-colour python3dist(colour)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
