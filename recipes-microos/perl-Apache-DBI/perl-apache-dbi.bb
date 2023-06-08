SUMMARY = "Initiate a persistent database connection"
DESCRIPTION = "This module initiates a persistent database connection. \
 \
The database access uses Perl's DBI. For supported DBI drivers see: \
 \
 http://dbi.perl.org/ \
 \
When loading the DBI module (do not confuse this with the Apache::DBI \
module) it checks if the environment variable 'MOD_PERL' has been set and \
if the module Apache::DBI has been loaded. In this case every connect \
request will be forwarded to the Apache::DBI module. This checks if a \
database handle from a previous connect request is already stored and if \
this handle is still valid using the ping method. If these two conditions \
are fulfilled it just returns the database handle. The parameters defining \
the connection have to be exactly the same, including the connect \
attributes! If there is no appropriate database handle or if the ping \
method fails, a new connection is established and the handle is stored for \
later re-use. There is no need to remove the disconnect statements from \
your code. They won't do anything because the Apache::DBI module overloads \
the disconnect method."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.12"

RPM_NAME = "perl-Apache-DBI-1.12-1.26.noarch.rpm"
RPM_HASH = "f9a3a9c4c2ef6d823125b435dd6e7f52f06f60f0dcd81cc850545aa98a3b3029bc27fa4484c6365c25eace37f700878eb5f7429e946dd75fcfcefab32170bd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Apache::AuthDBI) perl(Apache::DBI) perl(Apache::DBI::db) perl-Apache-DBI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DBI) perl(Digest::SHA1)"

inherit rpm
