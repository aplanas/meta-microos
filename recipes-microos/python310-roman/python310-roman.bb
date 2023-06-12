SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python310-roman-3.3-2.1.noarch.rpm"
RPM_HASH = "81f4a173718b8de1b304a7adb51c9d9a1aba6e3ffa9b4274f678914e4e331ae8a878d791a91edc548c98c971f246ed93f38319ee6cc526869eafafc947c6b419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roman \
python3.10dist(roman) \
python310-roman \
python3dist(roman)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm
