SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python310-django-pandas-0.6.6-2.4.noarch.rpm"
RPM_HASH = "dfcf189273da42e2e59cfa647d924a17b231466a6c1658f2505314f82d90fd6d5db419d6a5072fb910ae61ff95c3e81895ceb4bf306e6c31426d14aecc48cbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pandas \
python3.10dist(django-pandas) \
python310-django-pandas \
python3dist(django-pandas)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-pandas"

inherit rpm
