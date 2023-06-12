SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-confusable-homoglyphs-3.2.0-3.9.noarch.rpm"
RPM_HASH = "65fbd94a0daf72d5511fc66b57737b228fbabd6f44a06b3499397bd1ded2a6fb359f174b07dcda007adc33d41252adaecc6fd69d5adefd18ef57932640241c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(confusable-homoglyphs) \
python39-confusable-homoglyphs \
python3dist(confusable-homoglyphs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
update-alternatives"

inherit rpm
