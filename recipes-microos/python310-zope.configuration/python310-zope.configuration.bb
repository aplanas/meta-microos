SUMMARY = "Zope Configuration Markup Language (ZCML)"
DESCRIPTION = "The zope configuration system provides an extensible system for supporting \
various kinds of configurations. \
 \
It is based on the idea of configuration directives. Users of the configuration \
system provide configuration directives in some language that express \
configuration choices. The intent is that the language be pluggable. An XML \
language is provided by default."
LICENSE = "ZPL-2.1"

PV = "4.4.1"

RPM_NAME = "python310-zope.configuration-4.4.1-1.3.noarch.rpm"
RPM_HASH = "83e6a85fda0cde49d715d9d0b307b6cdb993e7c53db28119ea8be57dae17a1767aee42df3529881f8f9ec3b42907beeae1fcd477d0c30374f462d80bb8684e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.configuration python3.10dist(zope.configuration) python310-zope.configuration python3dist(zope.configuration)"
RDEPENDS:${PN} += "python(abi) python310-zope.i18nmessageid python310-zope.interface python310-zope.schema"

inherit rpm
