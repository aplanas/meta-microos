SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-django-webpack-loader-2.0.0-1.1.noarch.rpm"
RPM_HASH = "e45e0f69a3c3e4397ac3fdecd7c1099ece715f8ea3ab363d18aa0e64b1d71ffe5c30821a3d6864336b130f556e495b4c1d71c45f0db60a5451c851f130b542fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-webpack-loader) python39-django-webpack-loader python3dist(django-webpack-loader)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
