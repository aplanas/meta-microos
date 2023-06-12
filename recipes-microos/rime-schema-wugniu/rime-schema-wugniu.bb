SUMMARY = "wugniu input schema for rime"
DESCRIPTION = "wugniu input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-wugniu-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "2b052968d4b7c29ee96d27c1c5f68127d5ff3aafaf0bda1954a4272a2da21baca45e514c25153c994009cbe14dee0c3803759200c737c092589ff66252dc8a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wugniu"
RDEPENDS:${PN} += ""

inherit rpm
