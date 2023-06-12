SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python310-limnoria-2023.02.11-1.1.noarch.rpm"
RPM_HASH = "687c6816839647eb3f326871fdf2fadb4d9d6469940368b74e3e2e94bd63d48592701300b64c46f76d9b2ae3be9d68594c5fe346f57dda149725097b93027d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3-limnoria \
python3.10dist(limnoria) \
python310-limnoria \
python3dist(limnoria)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
procps \
python(abi) \
python310 \
python310-PySocks \
python310-chardet \
python310-cryptography \
python310-ecdsa \
python310-feedparser \
python310-python-dateutil \
python310-python-gnupg \
python310-pytzdata \
update-alternatives"

inherit rpm
