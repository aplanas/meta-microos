SUMMARY = "Modular, callback-based IRCv3 library for Python 3"
DESCRIPTION = "Pydle is a modular, callback-based IRCv3 library for Python 3. \
Features include: \
 \
* TLS \
* CTCP \
* ISUPPORT/PROTOCTL \
* WHOX \
* IRCv3.1 (full) \
* IRCv3.2 (base only, work in progress)"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-pydle-1.0.1-1.4.noarch.rpm"
RPM_HASH = "4ecaff533819b0b75e55c8cecb7da3f46db166a1a37f6cb5c62c7e290f66f5a87ac7e50d18143f82c244931a0ff71650c61a74acbdb0baf2eafa77e045b1c3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pydle"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/python3.9 python39-pure-sasl update-alternatives"

inherit rpm
