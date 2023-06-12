SUMMARY = "Extract Data From Macintosh Binhex Files"
DESCRIPTION = "*BinHex* is a format used by Macintosh for transporting Mac files safely \
through electronic mail, as short-lined, 7-bit, semi-compressed data \
streams. Ths module provides a means of converting those data streams back \
into into binary data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.125"

RPM_NAME = "perl-Convert-BinHex-1.125-1.25.noarch.rpm"
RPM_HASH = "5dd4a93c882c6240cb079e1c983082cad1e68421fdacb9469a5ffa522bac8ceec95ffdc8b7ce84ba1ad65ad49ee18333160f7cbb0d43374dc5383fd2c40b78c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Convert::BinHex) \
perl(Convert::BinHex::Bin2Hex) \
perl(Convert::BinHex::Fork) \
perl(Convert::BinHex::Hex2Bin) \
perl(Convert::BinHex::IO_Handle) \
perl(Convert::BinHex::IO_Scalar) \
perl-Convert-BinHex"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
