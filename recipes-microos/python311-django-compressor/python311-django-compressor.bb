SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python311-django-compressor-4.3.1-1.4.noarch.rpm"
RPM_HASH = "69cb0b92ed99fcc589fc99007321e9936b9961668565aee7ef15388c3d06d3eba0aef7f1ce58f516a9fe2339932dd159de4ff2108564b622d8d8284d46391d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-compressor) \
python311-django-compressor \
python311-django_compressor \
python3dist(django-compressor)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-Jinja2 \
python311-beautifulsoup4 \
python311-csscompressor \
python311-django-appconf \
python311-rcssmin \
python311-rjsmin \
python311-slimit"

inherit rpm
