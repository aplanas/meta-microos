SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-llvmjit-1.1.0-4.1.aarch64.rpm"
RPM_HASH = "55939f4ddd85581fac25372816263bd434afd3e122b184308b07c14898688de5c0fd6482283966f6bde8a9167c1c3f8a1baef41b5998a625be39dfaa8d58a9cd"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw-llvmjit postgresql11-pgsql-ogr-fdw-llvmjit(aarch-64)"
RDEPENDS:${PN} += "postgresql11-llvmjit postgresql11-pgsql-ogr-fdw postgresql11-server"

inherit rpm
