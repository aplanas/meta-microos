SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-django-user-agents-0.4.0-2.8.noarch.rpm"
RPM_HASH = "e8311487a739509310c68695e3c02b7f254c70de2f1344f9451b1fd1bf20de2cf43b9e5953cc7734c0ab32450b73b9c07f3df721623319496b5c5a775d781903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-user-agents) \
python311-django-user-agents \
python3dist(django-user-agents)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-user-agents"

inherit rpm
