SUMMARY = "Activate syntax extensions"
DESCRIPTION = "This module activates community provided syntax extensions to Perl. You \
pass it a feature name, and optionally a scalar with arguments, and the \
dispatching system will load and install the extension in your package. \
 \
The import arguments are parsed with the Data::OptList manpage. There are \
no standardised options. Please consult the documentation for the specific \
syntax feature to find out about possible configuration options. \
 \
The passed in feature names are simply transformed: 'function' becomes the \
Syntax::Feature::Function manpage and 'foo_bar' would become \
'Syntax::Feature::FooBar'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-syntax-0.004-5.25.noarch.rpm"
RPM_HASH = "65eb3b1462af509b65bf5787d959b141f5522e9b0d9a18b93aa44cd15559925d6bde6683d71cc8dbdbd8ee68e61a4ca66034be6ce346b1a4bb1de48f56d985c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(syntax) perl-syntax"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Data::OptList) perl(namespace::clean)"

inherit rpm
