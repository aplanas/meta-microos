SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python310-Flask-Admin-1.6.0-3.4.noarch.rpm"
RPM_HASH = "1d219786a9816d6f9bda0ed588c99e5450a4f4d90b47a2bddbbe3f8b71f956a046dd6e728b1d00f8c40d35eb6dfd18f2c98d4b45abb882d984705552312fefb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Admin python3.10dist(flask-admin) python310-Flask-Admin python3dist(flask-admin)"
RDEPENDS:${PN} += "python(abi) python310-Flask python310-WTForms"

inherit rpm
