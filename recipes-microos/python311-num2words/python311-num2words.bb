SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python311-num2words-0.5.12-1.4.noarch.rpm"
RPM_HASH = "6e92420af89ea7c442c1b06736c399a74fdedc0943d61a770890682e41b5876962dcaf41240f19ca32e2ade3a2069adafaf4c94549869826c01ae5187de35040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(num2words) python311-num2words python3dist(num2words)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-docopt update-alternatives"

inherit rpm
