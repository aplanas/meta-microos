SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python39-django-attachments-1.11-1.1.noarch.rpm"
RPM_HASH = "e61d15b709cd2be966cc38e864b07bf7273986fc161b250e64608394cd16c3ea26396eb38840d728ad8cb0ea6fee656066fee5993deee40369aebd3804728ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-attachments) python39-django-attachments python3dist(django-attachments)"
RDEPENDS:${PN} += "python(abi) python39-django python39-six"

inherit rpm
