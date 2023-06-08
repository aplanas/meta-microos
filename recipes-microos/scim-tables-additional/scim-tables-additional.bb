SUMMARY = "Input Method data for non-CJK languages, including Russian etc"
DESCRIPTION = "Input Method data for non-CJK languages, including Russian etc. for the \
scim-tables input method module."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-additional-0.5.14.1-2.31.aarch64.rpm"
RPM_HASH = "e239abfbba8c90bd5ea321e2d8aaad62b3dc3b186ab8369dcd49159ebf63083e49f7e1532af0a2e4c6f7230f77628f77bf426019a641fdda73b267860a9fba70"

RPROVIDES:${PN} += "locale(scim-tables:am;ar;bn;gu;hi;kn;ml;ne;pa;ru;ta;te;th;vi) scim-tables-additional scim-tables-additional(aarch-64)"
RDEPENDS:${PN} += "scim-tables"

inherit rpm
