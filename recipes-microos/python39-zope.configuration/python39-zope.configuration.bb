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

RPM_NAME = "python39-zope.configuration-4.4.1-1.3.noarch.rpm"
RPM_HASH = "5ac898bf94e01aaf18944551484d7d7991ff5ddf59fdb44778c99fc4c1b72bcc930c4864aaa3663ee4506012af34f96caff66ae6b8ebda3316258c9ce0ab6f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.configuration) python39-zope.configuration python3dist(zope.configuration)"
RDEPENDS:${PN} += "python(abi) python39-zope.i18nmessageid python39-zope.interface python39-zope.schema"

inherit rpm
