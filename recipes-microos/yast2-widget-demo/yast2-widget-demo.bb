SUMMARY = "YaST2 - widget demo"
DESCRIPTION = "A YaST2 module to demonstrate the UI widgets and for style sheet testing"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "yast2-widget-demo-0.9.1-1.9.noarch.rpm"
RPM_HASH = "c34812585c7f3a9aa0a72645cfab8721cfc385d3f8e12a963a83ffffc21096e6c3fa5d62d2a393f43775bf99544d84bb06b71b77afc1cf5cc365067bac2075d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-widget-demo"
RDEPENDS:${PN} += "yast2 yast2-ruby-bindings"

inherit rpm
