SUMMARY = "YaST2 - LDAP Agent"
DESCRIPTION = "This agent is used by various YaST2 modules to work with LDAP. It \
enables searching the LDAP tree and adding/deleting/modifying items on \
an LDAP server."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ldap-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "5ecad06ed54fbb1392f5deb5410b3dee21f2c39e132048038d8f5786806eac8caa0b7b946fa0d7cf2ed1a3da9763c0ce5d4e362596d0c11368d9588f446b1256"

RPROVIDES:${PN} += "libpy2ag_ldap.so.2()(64bit) perl(LdapServerAccess) yast2-ldap yast2-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) ldapcpplib libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldapcpp.so.0()(64bit) libscr.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) liby2.so.4()(64bit) liby2util.so.5()(64bit) libycp.so.5()(64bit) libycpvalues.so.6()(64bit) yast2 yast2-network"

inherit rpm
