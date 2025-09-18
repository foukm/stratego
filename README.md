# STRATEGO – Ice vs Fire (Java Swing, MVC)

A desktop implementation of **Stratego (Ice vs Fire theme)** built with **Java Swing** following a clean **MVC** architecture.  
The game features a grid-based board, two players (Red vs Blue), movable and unmovable pieces with ranks/abilities, turn logic, captures, optional reduced army mode, and an information panel with live stats.

---

## 🧠 Architecture (MVC)

- **Model**: game domain (Pieces, Board, Players, collections).  
  - `Piece` interface with concrete types: `Moveable` (e.g., Dragon, Knight, Elf…) and `Unmoveable` (Bomb, Flag).  
  - `Board` as an 8×10 `Piece[][]` with helpers for placement, emptiness checks, illegal zones, etc.  
  - `Player` (abstract) with Red/Blue subclasses, captures/survives counters, reduced-army option.  
- **Controller**: orchestrates rules, turns, combat resolution, visibility of hidden/normal pieces, random setup helpers, etc.  
- **View**: Swing UI  
  - `GraphicUI`: grid of `JButton`s representing cells and pieces; yellow cells mark forbidden zones.  
  - `Menu`: pre-game popup (choose **reduced army** or not).  
  - `Informations`: side panel showing current player, turn, rescues, capture stats, winner message.

> The above components and interactions reflect the report’s design and UML diagrams

---

## 🎮 Gameplay Highlights

- Two teams (**Red** vs **Blue**) with themed piece sets and ranks.
- Movable vs unmovable pieces, capture/rescue rules, success/attempt counters per player.
- Turn-based flow controlled by the `Controller`.
- Optional **reduced army** mode via pre-game popup.
- Right-side **Informations** panel with turn & capture stats.
- Hidden vs normal piece images to limit opponent knowledge.

---

## 🖥️ Technologies

- **Language/UI**: Java, **Swing**
- **Paradigm**: **MVC** separation (Model / View / Controller)
- **UML/Docs**: diagrams & report

---

