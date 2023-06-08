SUMMARY = "Provides tables for PrawnPDF"
DESCRIPTION = "Prawn::Table provides tables for the Prawn PDF toolkit."
LICENSE = "GPL-2.0 | GPL-3.0"

PV = "0.2.2"

RPM_NAME = "ruby3.2-rubygem-prawn-table-0.2.2-1.13.aarch64.rpm"
RPM_HASH = "c6f91ca460ce9472da947d50dc93cb2a7865f385bc878ccf09f2498145640e199b3aad65cad454e83f5b5360872297974c2f6b1b1320f4e9f504e558e3589a35"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn-table ruby3.2-rubygem-prawn-table(aarch-64) rubygem(prawn-table) rubygem(ruby:3.2.0:prawn-table) rubygem(ruby:3.2.0:prawn-table:0) rubygem(ruby:3.2.0:prawn-table:0.2) rubygem(ruby:3.2.0:prawn-table:0.2.2)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:prawn)"

inherit rpm
