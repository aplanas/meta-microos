SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230502.1ab1dde"

RPM_NAME = "rpmlint-2.4.0+git20230502.1ab1dde-1.6.noarch.rpm"
RPM_HASH = "30e377854d9ff8ec20b779d5512fe3b845a6ebd717041e36287df6a35446d7b09f8cfea239297b3f5bc30d62311ae244c9c51400c281131afac416805f06e907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rpmlint) python3.10dist(rpmlint) python3dist(rpmlint) rpmlint"
RDEPENDS:${PN} += "/usr/bin/python3 appstream-glib bash binutils checkbashisms cpio dash desktop-file-utils file findutils myspell-en_US python(abi) python3-pybeam python3-pyenchant python3-python-magic python3-pyxdg python3-rpm python3-tomli python3-tomli-w python3-zstandard rpm-build"

inherit rpm
