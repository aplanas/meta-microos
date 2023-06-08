SUMMARY = "Exporting done right"
DESCRIPTION = "Exporter::Declare is a meta-driven exporting tool. Exporter::Declare tries \
to adopt all the good features of other exporting tools, while throwing \
away horrible interfaces. Exporter::Declare also provides hooks that allow \
you to add options and arguments for import. Finally, Exporter::Declare's \
meta-driven system allows for top-notch introspection."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.114"

RPM_NAME = "perl-Exporter-Declare-0.114-1.24.noarch.rpm"
RPM_HASH = "f7ed62213230fd34b2026ceec80863582b8f980fcd532d079b67d1f81e515ed7eaf1e54c6d45205e318c1cc131c36bfa8a782fdd69d5cb86209a7c04751a462e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Exporter::Declare) perl(Exporter::Declare::Export) perl(Exporter::Declare::Export::Alias) perl(Exporter::Declare::Export::Generator) perl(Exporter::Declare::Export::Sub) perl(Exporter::Declare::Export::Variable) perl(Exporter::Declare::Meta) perl(Exporter::Declare::Specs) perl-Exporter-Declare"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Meta::Builder) perl(aliased)"

inherit rpm
