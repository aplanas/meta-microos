SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python310-django-codemod-1.11.0-1.6.noarch.rpm"
RPM_HASH = "ab60816db891e7466631b1645c4dffefb6177d0be943395b01b6a8214183272f0947bdd8e43217799421ac2a5e53a7eccd88b7a68fb5a138f93855781efb5099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-codemod \
python3.10dist(django-codemod) \
python310-django-codemod \
python3dist(django-codemod)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-libcst \
python310-pathspec \
python310-rich-click \
update-alternatives"

inherit rpm
