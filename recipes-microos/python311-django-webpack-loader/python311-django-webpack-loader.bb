SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python311-django-webpack-loader-1.8.1-1.3.noarch.rpm"
RPM_HASH = "362d705bf68642e6a9b5a4a8241c3fda0f2ef8beca7b10ba39ec9e0bfb1d238a65c9e5375c612cecba277cd0240d256ef18462aa85be090f0655466b52e2acdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-webpack-loader) python311-django-webpack-loader python3dist(django-webpack-loader)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
