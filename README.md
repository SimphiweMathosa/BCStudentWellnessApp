# BC Student Wellness Management System

## Project Summary
Belgium Campus has commissioned our team to design and build an end‑to‑end **Student Wellness Management System** that supports both web and desktop clients:

* **Web module (Milestone 1 – completed 14 Jul 2025)** A JSP web‑app providing secure student registration and login.
* **Desktop module (Milestone 2 – due 17 Jul 2025)** A Java Swing application for day‑to‑day management of wellness services—appointments, counsellors, and feedback—with JavaDB / PostgreSQL persistence.

The system demonstrates proficiency in Core Java, OOP principles, GUI design, and database integration while following an MVC architecture for clean separation of concerns.

---

## Key Requirements (Milestone 2)
| Area | Details |
|------|---------|
| **Core Java & OOP** | Inheritance, polymorphism, encapsulation, abstraction, collections, exception handling, full MVC layering |
| **GUI (Swing)** | Dashboard with tabs/menus for:<br>• Appointment Management<br>• Counselor Management<br>• Feedback Management |
| **Database** | JavaDB embedded (Derby) for local development, optional PostgreSQL for production<br>Tables: `Appointments`, `Counselors`, `Feedback` |
| **CRUD Operations** | <br>**Appointments** — book, list, update/reschedule, cancel<br>**Counselors** — add, view, update, remove<br>**Feedback** — submit (1‑5 rating + comments), view history, edit, delete |
| **UX Expectations** | Input validation, confirmation dialogs on destructive actions, robust error handling (e.g., lost DB connection) |
| **Assessment** | 30 marks for Milestone 2; total project 50 marks |

---

## Repository Structure
```
BC‑Wellness‑System/
├── desktop‑app/           # Swing source code (MVC)
│   ├── src/
│   ├── resources/
│   └── pom.xml            # Maven build
├── web‑app/               # JSP module (Milestone 1)
├── database/              # SQL schemas, seed data, ERD diagrams
├── docs/                  # Design docs, UML, user guides
└── README.md
```

---

## Getting Started
### Prerequisites
- **JDK 17 or later** (tested on OpenJDK 21)
- **Apache Derby (JavaDB)** 10.17 embedded libraries
- **Maven 3.9+**
- (Optional) **PostgreSQL 15+** if deploying to an external DB

### Setup Instructions
1. **Clone** the repository:
   ```bash
   git clone https://github.com/<your‑org>/BC‑Wellness‑System.git
   cd BC‑Wellness‑System/desktop‑app
   ```
2. **Configure database**
   - *Embedded JavaDB*: no extra setup—Derby will create a local DB in `~/.derby/BCWellnessDB`.
   - *PostgreSQL*: edit `src/main/resources/db.properties` with your connection string.
3. **Build & run**
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="za.ac.belgiumcampus.Main"
   ```

> **Tip:** Use the provided sample data script in `database/seed/` to preload demo counsellors and appointments.

---

## Usage Guide
| Module | What you can do |
|--------|-----------------|
| **Appointments** | Book a session → choose counsellor/date/time → reschedule or cancel if plans change |
| **Counsellors** | HR/admins add new counsellors, update availability, or remove departures |
| **Feedback** | Students rate sessions (1‑5 stars) and leave comments; staff review analytics |

Screenshots and a full user manual are available in `/docs/user‑guide.pdf`.

---

## Development Practices
- **MVC Pattern**: `model` (POJOs + DAO) • `view` (Swing forms) • `controller` (logic & event handling)
- **Exception Strategy**: custom domain exceptions per layer, logged via SLF4J
- **Unit Testing**: JUnit 5 with in‑memory Derby for DAO tests
- **CI/CD**: GitHub Actions build & test workflow (`.github/workflows/ci.yml`)
- **Coding Standard**: Google Java Style, validated by `spotless‑maven‑plugin`

---

## Contributing
1. **Fork** → **branch** (`feat/short‑description`) → **PR** to `main`.
2. Follow commit convention: `type(scope): summary` (e.g., `feat(appointment): enable reschedule dialog`).
3. At least one reviewer approval + green CI before merge.

See [`CONTRIBUTING.md`](docs/CONTRIBUTING.md) for detailed guidelines.

---

## Project Team
| Role | Name | 
|------|------|
| Project Lead | Simphiwe Mathosa | 
| Backend Dev  | Cameron Brighton | 
| Front‑end Dev | Dehan Barnard |
| QA / Testing | Mamello Lelaka | 

> **Action:** Each member must supply their GitHub handle and email so we can add you as collaborators.

---

## License
Distributed under the **MIT License**. See `LICENSE` for details.

---

## Acknowledgements
- Belgium Campus for the project brief and assessment rubric.
- Oracle Derby team for JavaDB.
- Open‑source libraries: SwingX, SLF4J, JUnit.

---

> _“Software is a great combination between artistry and engineering.” — Bill Gates_
