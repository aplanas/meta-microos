SUMMARY = "Rich architecture for interactive computing with Python"
DESCRIPTION = "IPython provides a rich toolkit to help you make the \
most out of using Python interactively. Its main \
components are: \
 \
 * A powerful interactive Python shell \
 * A Jupyter kernel to work with Python code in \
   Jupyter notebooks and other interactive frontends. \
 \
The enhanced interactive Python shells have the \
following main features: \
 \
 * Comprehensive object introspection. \
 * Input history, persistent across sessions. \
 * Caching of output results during a session with automatically \
   generated references. \
 * Extensible tab completion, with support by default for completion \
   of python variables and keywords, filenames and function keywords. \
 * Extensible system of ‘magic’ commands for controlling the \
   environment and performing many tasks related either to IPython or \
   the operating system. \
 * A rich configuration system with easy switching between different \
   setups (simpler than changing $PYTHONSTARTUP environment variables \
   every time). \
 * Session logging and reloading. \
 * Extensible syntax processing for special purpose situations. \
 * Access to the system shell with user-extensible alias system. \
 * Easily embeddable in other Python programs and GUIs. \
 * Integrated access to the pdb debugger and the Python profiler."
LICENSE = "BSD-3-Clause"

PV = "8.13.2"

RPM_NAME = "python39-ipython-8.13.2-1.1.noarch.rpm"
RPM_HASH = "7418f44d71a9b1738f26a2007e35435b51854ed2f2ae756461b42e32636ba0c290d25c9380c4a9114a911cca1ba4d24c68755642ed8cdb5813dd6bb5f4f857ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 application() application(ipython-3.9.desktop) jupyter-ipython python3.9dist(ipython) python39-IPython python39-ipython python39-ipython-doc python39-jupyter_ipython python39-jupyter_ipython-doc python39-jupyter_ipython-doc-html python39-jupyter_ipython-doc-pdf python3dist(ipython)"
RDEPENDS:${PN} += "(python39-prompt_toolkit >= 3.0.38 with python39-prompt_toolkit < 3.1) /bin/sh /usr/bin/python3.9 alts python(abi) python39 python39-backcall python39-decorator python39-jedi python39-matplotlib-inline python39-pexpect python39-pickleshare python39-pygments python39-stack-data python39-traitlets python39-typing-extensions"

inherit rpm
