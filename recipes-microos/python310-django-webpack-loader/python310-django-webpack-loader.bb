SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python310-django-webpack-loader-1.8.1-1.3.noarch.rpm"
RPM_HASH = "c163e184d0e831c2ba718bbcde3d7d0640b769b9ccd3e2d568bd0723cf67f4b9029f8e5e0ca0b37240e7d89d36908ce7f413997ab01a3b0aec705a43593524e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-webpack-loader python3.10dist(django-webpack-loader) python310-django-webpack-loader python3dist(django-webpack-loader)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
