SUMMARY = "YaST2 SLP Daemon Server Configuration"
DESCRIPTION = "This package contains the YaST2 component for the configuration of an \
SLP daemon."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-slp-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "8bb5e088a0ae69f1508ee43a695515a9817ef2eba2e0ca68194a11e68168754cc8e6f3e5676f412cbac921c5d1450b773f084cfbcf6061b4e9e444607b47ebf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.SLPServer.desktop) metainfo() metainfo(org.opensuse.yast.SLPServer.metainfo.xml) yast2-slp-server"
RDEPENDS:${PN} += "yast2 yast2-ruby-bindings"

inherit rpm
