SUMMARY = "Pickled object field for Django"
DESCRIPTION = "django-picklefield provides an implementation of a pickled object field. \
Such fields can contain any picklable objects. \
 \
The implementation is taken and adopted from Django snippet #1694 \
<http://www.djangosnippets.org/snippets/1694/> by Taavi Taijala, which is in \
turn based on Django snippet #513 <http://www.djangosnippets.org/snippets/513/> \
by Oliver Beattie."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-django-picklefield-3.1.0-1.3.noarch.rpm"
RPM_HASH = "3dc06298a321805a7df15d819223f454551bac6c5449db95330e1470a95664a4bef0f313cadcda48e1bc1c330d58df7da5b7d9affa8e79979bead5f242f94be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-picklefield) \
python39-django-picklefield \
python3dist(django-picklefield)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
