SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-xerox-0.4.1-2.14.noarch.rpm"
RPM_HASH = "d44e4c74b519166b79c9ea90312c19d743a72f8f338665a838b30a5c17b72a35aabb615f39d26f6da049201c5b5c1cee53f9a7f0cc722bfba27e40e95581273a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xerox) \
python311-xerox \
python3dist(xerox)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives \
xclip"

inherit rpm
