SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql15-devel package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-server-devel-15-2.4.noarch.rpm"
RPM_HASH = "de5acc131ba39951a3d54c347454933fb569510203ccf4060f3205a864ae4e5020ada0bab2bcd8268dd6d5cf7dc7cfa16e95d41d8abfb7fda6374210a863f17e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-noarch rpm_macro(make_pgxs) rpm_macro(make_pgxs_install) rpm_macro(pg_config_bindir) rpm_macro(pg_config_cc) rpm_macro(pg_config_cflags) rpm_macro(pg_config_cflags_sl) rpm_macro(pg_config_configure) rpm_macro(pg_config_cppflags) rpm_macro(pg_config_docdir) rpm_macro(pg_config_htmldir) rpm_macro(pg_config_includedir) rpm_macro(pg_config_includedir_server) rpm_macro(pg_config_ldflags) rpm_macro(pg_config_ldflags_ex) rpm_macro(pg_config_ldflags_sl) rpm_macro(pg_config_libdir) rpm_macro(pg_config_libs) rpm_macro(pg_config_localedir) rpm_macro(pg_config_mandir) rpm_macro(pg_config_pgxs) rpm_macro(pg_config_pkgincludedir) rpm_macro(pg_config_pkglibdir) rpm_macro(pg_config_sharedir) rpm_macro(pg_config_sysconfdir) rpm_macro(pg_obsolete_llvm_subpackage) rpm_macro(pg_server_requires) rpm_macro(pg_version_from_name) rpm_macro(postgresql_has_llvm)"
RDEPENDS:${PN} += "postgresql-server-devel-implementation"

inherit rpm
