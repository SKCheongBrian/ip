public class ListCommand extends Command {
    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.printStartList();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            ui.printTask(task, i + 1);
        }
        ui.printLine();
    }
}
