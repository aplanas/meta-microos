SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python310-num2words-0.5.12-1.4.noarch.rpm"
RPM_HASH = "d5ebbbcc42edfc9eea07633b61cf1d84a81e59f843166398c5212b55c88af7294d7069feda73c1ad5adc3c647192e9f5cc2fdfdca3d0eb80b6e6ad629e78df85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-num2words python3.10dist(num2words) python310-num2words python3dist(num2words)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-docopt update-alternatives"

inherit rpm
