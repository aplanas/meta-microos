SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python39-num2words-0.5.12-1.4.noarch.rpm"
RPM_HASH = "427d7cf71917b0fa936b06d928a9fbd2425be64daeaa8bba4f6bd324d2e17b6b4e6d135358b51d699ff4e055919f278176fea2b36102de9f0844aeb58c075e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(num2words) python39-num2words python3dist(num2words)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-docopt update-alternatives"

inherit rpm
