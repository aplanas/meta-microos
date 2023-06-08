SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python39-django-axes-5.40.1-1.3.noarch.rpm"
RPM_HASH = "7d6af854fc68e9b699f4a526855ad5d345c1dce4e8dce28230d3ac6308ceb5716a24a0578f56dd3d64235cf2b3f3922bda4c38963244b30e1485754d19fff7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-axes) python39-django-axes python3dist(django-axes)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-django-ipware"

inherit rpm
