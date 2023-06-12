SUMMARY = "YaST2 - PAM Agent"
DESCRIPTION = "This agent is used by YaST2 to modify the PAM configuration files"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-pam-4.6.0-1.1.noarch.rpm"
RPM_HASH = "f4a0b048fd51cdb147569ac14a2cb631522e30cf7ad15598eace4f302acdaee847405e8e0b739f066bea528009e084847ac6120e6b02e37e1d5695c2fc193c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-pam"
RDEPENDS:${PN} += "/usr/bin/perl \
augeas-lenses \
pam-config \
rubygem(ruby:3.2.0:cfa) \
yast2 \
yast2-ruby-bindings"

inherit rpm
