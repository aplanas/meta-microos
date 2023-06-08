SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python39-Flask-Admin-1.6.0-3.4.noarch.rpm"
RPM_HASH = "0f58aa71a8aab9560ff8a2d959e370164d1b79cc2b862cbcc6d368eee7f2ca4d23b7071f2f0c1e96ad651681873ab3c72b55f5264c5b115f2c11835f7d888692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-admin) python39-Flask-Admin python3dist(flask-admin)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-WTForms"

inherit rpm
