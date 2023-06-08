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

RPM_NAME = "python311-zope.configuration-4.4.1-1.3.noarch.rpm"
RPM_HASH = "21a90935c17af2f1c53c2dd2035df1a49cb15eee87dc2b2f2e4cd80fde7954ba3de57b5176939f91a3d807c4ee5c41f30278230fea84a7c7d0f97d8e28bc841b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.configuration) python311-zope.configuration python3dist(zope.configuration)"
RDEPENDS:${PN} += "python(abi) python311-zope.i18nmessageid python311-zope.interface python311-zope.schema"

inherit rpm
