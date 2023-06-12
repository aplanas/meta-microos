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

RPM_NAME = "python311-django-picklefield-3.1.0-1.3.noarch.rpm"
RPM_HASH = "de04bb6facb132f597cbdd1e2eeb7956a27e9f5201993749a62e6f341076e8827c24a43441770984e08d1a6359373f2e71b5c5440f95d137dddf19f41e239ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-picklefield) \
python311-django-picklefield \
python3dist(django-picklefield)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
