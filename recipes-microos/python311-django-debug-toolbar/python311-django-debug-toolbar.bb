SUMMARY = "A configurable set of panels that display various debug information"
DESCRIPTION = "The Django Debug Toolbar is a configurable set of panels that display various \
debug information about the current request/response and when clicked, display \
more details about the panel's content. \
 \
Currently, the following panels have been written and are working: \
 - Django version \
 - Request timer \
 - A list of settings in settings.py \
 - Common HTTP headers \
 - GET/POST/cookie/session variable display \
 - Templates and context used, and their template paths \
 - SQL queries including time to execute and links to EXPLAIN each query \
 - List of signals, their args and receivers \
 - Logging output via Python's built-in logging, or via the logbook module \
 \
There is also one Django management command currently: \
 - debugsqlshell: Outputs the SQL that gets executed as you work in the Python \
   interactive shell."
LICENSE = "BSD-3-Clause"

PV = "3.6"

RPM_NAME = "python311-django-debug-toolbar-3.6-1.4.noarch.rpm"
RPM_HASH = "2399ed97a62547ee698c583e7c757e7502d14a50b73db46d14aff3da87ecfb17291f0b7a38e891ee30903fde2ce388a5262c1ff06e28ffb5af29822b75dac358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-debug-toolbar) python311-django-debug-toolbar python3dist(django-debug-toolbar)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-django-jinja python311-sqlparse"

inherit rpm
