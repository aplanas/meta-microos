SUMMARY = "YaST2 - Configuration of Linux Auditing (LAF)"
DESCRIPTION = "This module allows the configuration of the audit daemon as well as to \
add rules for the audit subsystem."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-audit-laf-4.6.0-1.1.noarch.rpm"
RPM_HASH = "88b7378adc010fa7fc22a400687628a5d0583772ae50e00483d44a75ea77aca5611d4fbd8b92e4dfa3c20b66468720e9ebc330c3b9e97f4828dc6a37dc1ecce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.AuditLAF.desktop) \
metainfo() \
metainfo(org.opensuse.yast.AuditLAF.metainfo.xml) \
yast2-audit-laf"
RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
