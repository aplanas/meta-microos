SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-django-user-agents-0.4.0-2.8.noarch.rpm"
RPM_HASH = "ed823eff91a59de671b9cac1f63361dfd8a178f41bdbd6f8c1654a87653d292c28e32765880a20d30badf137252a867051d5f5d57b32c4fb0dfda128694b6ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-user-agents) python39-django-user-agents python3dist(django-user-agents)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-user-agents"

inherit rpm
