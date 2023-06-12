SUMMARY = "File Server"
DESCRIPTION = "The 32bit pattern complementing file_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-file_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "f0ba111c998fc34f3851aa5744ae5ea94b9a5edec3055d67988bf2f54754909063dba73f97eb68e705af53254bef32624737fd101c2d22463494dc33eb658f5e"

RPROVIDES:${PN} += "pattern() patterns-server-file_server-32bit patterns-server-file_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
