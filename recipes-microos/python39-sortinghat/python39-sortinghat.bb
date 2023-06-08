SUMMARY = "A tool to manage identities"
DESCRIPTION = "A tool to manage identities. \
 \
Sorting Hat maintains an SQL database with identities coming \
(potentially) from different sources. Identities corresponding to the \
same real person can be merged in the same unique identity, with a \
unique uuid. For each unique identity, a profile can be defined, with \
the name and other data to show for the corresponding person by default. \
 \
In addition, each unique identity can be related to one or more \
affiliations, for different time periods. This will usually correspond \
to different organizations in which the person was employed during those \
time periods. \
 \
Sorting Hat is a part of the GrimoireLab \
toolset <https://grimoirelab.github.io>, which provides for Python \
modules and scripts to analyze data sources with information about \
software development, and allows to produce interactive dashboards to \
visualize that information. \
 \
In the context of GrimoireLab, Sorting Hat is usually run after data is \
retrieved with Perceval <https://github.com/grimmoirelab/perceval>, \
to store the identities obtained into its database, and later merge them \
into unique identities (and maybe affiliate them)."
LICENSE = "GPL-3.0-only"

PV = "0.7.23"

RPM_NAME = "python39-sortinghat-0.7.23-1.5.noarch.rpm"
RPM_HASH = "f891ac76fa767712a64a4c245070f640f419f4bd312672914f2eb689d90b66661649fb64d98229e58bf5b7f9cf66a6c1c5d3a0c2f4b2ac550588f28e460d27af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sortinghat) python39-sortinghat python3dist(sortinghat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Jinja2 python39-PyMySQL python39-PyYAML python39-SQLAlchemy python39-pandas python39-python-dateutil python39-requests python39-urllib3 update-alternatives"

inherit rpm
