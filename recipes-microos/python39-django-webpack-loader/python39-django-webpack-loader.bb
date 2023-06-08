SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python39-django-webpack-loader-1.8.1-1.3.noarch.rpm"
RPM_HASH = "7629890627a5bac31e26bebe04bab79748229e1464426c3706caca479af2c87691669c66d6b99594701927c6e5a0fc5fb552e3d2ccc2fb32c00a338b4fc2dfbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-webpack-loader) python39-django-webpack-loader python3dist(django-webpack-loader)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
