SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-2.4.0+git20230602.89901a92-1.1.noarch.rpm"
RPM_HASH = "bbef0791ec1df5ff820e03fdb49f0d9b048e5384bc0d236fbe41de776b408f8ec42c197808a984b9580d2ccd28862bcc02edcbe5c3b1a04040caf662f82d565f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rpmlint) \
python3.10dist(rpmlint) \
python3dist(rpmlint) \
rpmlint"
RDEPENDS:${PN} += "/usr/bin/python3 \
appstream-glib \
bash \
binutils \
checkbashisms \
cpio \
dash \
desktop-file-utils \
file \
findutils \
myspell-en_US \
python(abi) \
python3-pybeam \
python3-pyenchant \
python3-python-magic \
python3-pyxdg \
python3-rpm \
python3-tomli \
python3-tomli-w \
python3-zstandard \
rpm-build"

inherit rpm
