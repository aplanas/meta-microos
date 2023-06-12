SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python39-django-codemod-1.11.0-1.6.noarch.rpm"
RPM_HASH = "b42b8f738f2858ed006dc7091c5b5be6281f2bc42e9d1439da1ade82ffd74867e7f42fae711b7eb437743dc78d0b21a6d3fd94888cac92c90c8b2b400ed1dc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-codemod) \
python39-django-codemod \
python3dist(django-codemod)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
python39-libcst \
python39-pathspec \
python39-rich-click \
update-alternatives"

inherit rpm
